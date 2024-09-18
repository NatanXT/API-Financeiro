PessoaServicepackage com.Financeiro.APIFinanceiro.service;

import com.Financeiro.APIFinanceiro.DTO.MetaDto;
import com.Financeiro.APIFinanceiro.model.Meta;
import com.Financeiro.APIFinanceiro.repository.MetaRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@SpringBootApplication
@RequiredArgsConstructor
public class MetaService {
    private final MetaRepository metaRepository;
    public Meta findById(Long id){
        return this.metaRepository.findById(id).orElseThrow(()->new MetaNotFoundException("Meta não encontrada!"));

    }
    public List<Meta> findAll() {
        return this.metaRepository.findAll();
    }

    public Meta save(MetaDto metaDto) {
        return this.metaRepository.save(metaDto.mapToEntity());
    }

    public Meta update(MetaDto metaDto) {
        if (Objects.isNull(metaDto.id())) return this.save(metaDto);
        return this.metaRepository.save(metaDto.mapToEntity());
    }

    public void delete(Long id){
        this.metaRepository.deleteById(id);
    }
}
}
