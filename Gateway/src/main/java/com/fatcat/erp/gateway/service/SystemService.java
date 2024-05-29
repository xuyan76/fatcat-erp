package com.fatcat.erp.gateway.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("erp-service-system")
public interface SystemService {


}
