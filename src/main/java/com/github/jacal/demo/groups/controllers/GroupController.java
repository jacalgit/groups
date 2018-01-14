package com.github.jacal.demo.groups.controllers;

import com.github.jacal.demo.groups.services.GroupService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
@AllArgsConstructor
public class GroupController {

    private GroupService groupService;
}
