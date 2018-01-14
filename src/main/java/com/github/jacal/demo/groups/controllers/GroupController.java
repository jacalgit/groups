package com.github.jacal.demo.groups.controller;

import lombok.RequiredArgsConstructor;

@RestController("/")
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;
}
