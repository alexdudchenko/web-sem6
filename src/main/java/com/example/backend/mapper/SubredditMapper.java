package com.example.backend.mapper;

import com.example.backend.dto.SubredditDto;
import com.example.backend.model.Subreddit;
import com.example.backend.model.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SubredditMapper {

    SubredditDto mapSubredditToDto(Subreddit subreddit);

    @InheritInverseConfiguration
    @Mapping(target = "posts", ignore = true)
    @Mapping(target = "user", source = "user")
    Subreddit mapDtoToSubreddit(SubredditDto subredditDto, User user);
}
