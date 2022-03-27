package com.github.iceant.application.node.console.api;

import com.github.iceant.application.node.console.dto.RoleDTO;
import com.github.iceant.application.node.console.service.ApplicationService;
import com.github.iceant.application.node.console.storage.entity.TBizRole;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping(path = {"/", ""})
    public Object listAll(){
        List<TBizRole> roles = applicationService.listAllRoles();
        return ApiResponse.ok(roles);
    }
}
