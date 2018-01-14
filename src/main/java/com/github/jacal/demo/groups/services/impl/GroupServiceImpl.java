package com.github.jacal.demo.groups.services.impl;

import com.github.jacal.demo.groups.commands.NewGroup;
import com.github.jacal.demo.groups.domain.Group;
import com.github.jacal.demo.groups.repositories.GroupRepository;
import com.github.jacal.demo.groups.services.GroupService;
import lombok.AllArgsConstructor;
import org.apache.commons.collections4.IteratorUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class GroupServiceImpl implements GroupService {

    private GroupRepository groupRepository;

    @Override
    public Group save(NewGroup newGroup) {
        Group group = new Group();
        group.setName(newGroup.getName());
        group.setDescription(newGroup.getDescription());
        return groupRepository.save(group);
    }

    @Override
    public List<Group> listAll() {
        List<Group> groups = new ArrayList<>();
        groupRepository.findAll().forEach(groups::add);
        return groups;
    }
}
