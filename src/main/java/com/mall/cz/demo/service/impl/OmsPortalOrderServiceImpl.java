package com.mall.cz.demo.service.impl;

import com.mall.cz.demo.common.api.CommonResult;
import com.mall.cz.demo.component.CancelOrderSender;
import com.mall.cz.demo.dto.OrderParam;
import com.mall.cz.demo.service.OmsPortalOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OmsPortalOrderServiceImpl implements OmsPortalOrderService {
    private static final Logger LOGGER = LoggerFactory.getLogger(OmsPortalOrderServiceImpl.class);
    @Autowired
    private CancelOrderSender cancelOrderSender;

    @Override
    public CommonResult generateOrder(OrderParam orderParam) {
        // TODO: 执行一系列下单操作
        LOGGER.info("generate order process");
        // 下单完成后开启一个延迟消息，用于当用户没有付款时取消订单（orderId应该在下单后生成）
        sendDelayMessageCancelOrder(11L);
        return CommonResult.success(null, "下单成功");
    }

    @Override
    public void cancelOrder(Long orderId) {
        // TODO: 执行一系类取消订单操作
        LOGGER.info("process cancelOrder orderId:{}",orderId);
    }

    public void sendDelayMessageCancelOrder(Long orderId) {
        long delayTimes = 30 * 1000; // 测试使用，30s
        cancelOrderSender.sendMessages(orderId, delayTimes);
    }
}
