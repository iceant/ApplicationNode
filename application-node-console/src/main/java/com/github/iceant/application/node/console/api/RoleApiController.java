package com.github.iceant.application.node.console.api;

import com.github.iceant.application.node.console.dto.RoleDTO;
import com.github.iceant.application.node.console.service.ApplicationService;
import com.github.iceant.application.node.console.storage.entity.TBizRole;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"/api/Role"})
public class RoleApiController {

    final ApplicationService applicationService;

    public RoleApiController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }


    @PostMapping(path = {"/", ""})
    public Object create(@RequestBody RoleDTO dto){
        TBizRole role = applicationService.createRole(dto);
        return ApiResponse.ok(role);
    }


}
