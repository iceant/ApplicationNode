package com.github.iceant.application.node.console.api;

import com.github.iceant.application.node.console.dto.MenuDTO;
import com.github.iceant.application.node.console.service.ApplicationService;
import com.github.iceant.application.node.console.storage.entity.TMenu;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path={"/api/Menu"})
public class MenuApiController {
    final ApplicationService applicationService;

    public MenuApiController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @PostMapping(path={"/", ""})
    public Object create(@RequestBody MenuDTO dto){
        TMenu menu = applicationService.saveMenu(dto);
        return ApiResponse.ok(menu);
    }
}
