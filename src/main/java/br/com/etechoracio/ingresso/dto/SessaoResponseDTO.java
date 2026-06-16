package br.com.etechoracio.ingresso.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public record SessaoResponseDTO (
    Integer id,
    LocalDate data,
    LocalTime horario,
    Double preco,
    String sala
){
}
