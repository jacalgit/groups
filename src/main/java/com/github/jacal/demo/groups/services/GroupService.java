package com.github.jacal.demo.groups.services;

import com.github.jacal.demo.groups.commands.NewGroup;
import com.github.jacal.demo.groups.domain.Group;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GroupService {

    Group save(NewGroup group);

    List<Group> listAll();
}
