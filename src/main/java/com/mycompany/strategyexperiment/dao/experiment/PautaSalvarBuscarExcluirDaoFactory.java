package com.mycompany.strategyexperiment.dao.experiment;

import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarPauta;
import com.mycompany.strategyexperiment.dao.experiment.excluir.ExcluirPauta;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarPauta;

public class PautaSalvarBuscarExcluirDaoFactory extends AbstractSalvarBuscarExcluirDaoFactory {
    
    @Override
    public AbstractSalvarBuscarExcluirDAO getSalvarBuscarExcluirDao() {
        return new PautaSalvarBuscarExcluirDAO(new SalvarPauta(),
                                               new BuscarPauta(),
                                               new ExcluirPauta());
    } 
}
