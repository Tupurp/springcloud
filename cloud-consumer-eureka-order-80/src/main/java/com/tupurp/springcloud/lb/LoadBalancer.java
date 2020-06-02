package com.tupurp.springcloud.lb;


import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * 实现轮询算法
 * */
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstanceList);
}