package br.com.etechoracio.ingresso.controller;

import br.com.etechoracio.ingresso.dto.SessaoResponseDTO;
import br.com.etechoracio.ingresso.entity.Sessao;
import br.com.etechoracio.ingresso.mapper.SessaoMapper;
import br.com.etechoracio.ingresso.repository.SessaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sessoes")
@CrossOrigin("*")
public class SessaoController {

    @Autowired
    private SessaoRepository sessaoRepository;

    @Autowired
    private SessaoMapper sessaoMapper;

    @GetMapping("/filme/{id}")
    public List<SessaoResponseDTO> findByFilmeId(@PathVariable Long id) {
        var sessoes = sessaoRepository.findByFilmeId(id);
        return sessaoMapper.toResponseDTOList(sessoes);
    }
}