package com.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PrestazioneDTO {

	private String tipologia;

	private Integer medicoId;

}
