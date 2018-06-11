package com.mycompany.strategyexperiment.dao.experiment;

import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarPauta;
import com.mycompany.strategyexperiment.dao.experiment.excluir.ExcluirPauta;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarPauta;

public class SalvarBuscarExcluirDaoFactory {
    public AbstractSalvarBuscarExcluirDAO getSalvarBuscarExcluirDaoFactory(String tipo) {
        
        switch (tipo) {
            case "pauta":
                return new PautaSalvarBuscarExcluirDAO(new SalvarPauta(),
                                                       new BuscarPauta(),
                                                       new ExcluirPauta());
            default:
                return null;
        }
    }
}
