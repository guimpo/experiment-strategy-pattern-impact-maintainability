package com.mycompany.strategyexperiment.dao.experiment;

import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarAnexo;
import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarAtaParticipante;
import com.mycompany.strategyexperiment.dao.experiment.excluir.ExcluirAnexo;
import com.mycompany.strategyexperiment.dao.experiment.excluir.ExcluirAtaParticipante;
import com.mycompany.strategyexperiment.dao.experiment.listar.ListarAnexo;
import com.mycompany.strategyexperiment.dao.experiment.listar.ListarAtaParticipante;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarAnexo;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarAtaParticipante;

public class AtaParticipanteFullDaoFactory extends FullDaoFactory {

    @Override
    public AbstractFullDAO getFullDao() {
        return new AtaParticipanteFullDAO(new SalvarAtaParticipante(),
                                                  new ListarAtaParticipante(),
                                                  new BuscarAtaParticipante(),
                                                  new ExcluirAtaParticipante());
    }
}
