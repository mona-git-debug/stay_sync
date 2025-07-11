package com.staysync.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.staysync.dtos.PgDetailsDto;
import com.staysync.models.PgDetails;

@Mapper(componentModel = "spring")
public interface PgDetailsMapper {
    @Mapping(source = "owner.id", target = "ownerId")
    PgDetailsDto toDto(PgDetails entity);

    // Remove mapping for owner in toEntity, set owner manually in service
    PgDetails toEntity(PgDetailsDto dto);

    List<PgDetailsDto> toDtoList(List<PgDetails> entities);
}