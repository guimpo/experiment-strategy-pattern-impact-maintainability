package com.mycompany.strategyexperiment.dao.experiment;

import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarDepartamento;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarDepartamento;

public class DepartamentoSalvarBuscarDaoFactory extends AbstractSalvarBuscarDaoFactory {
    @Override
    public AbstractSalvarBuscarDAO getSalvarBuscarDao() {
        return new DepartamentoSalvarBuscarDAO(new SalvarDepartamento(),
                                               new BuscarDepartamento());
    }
}
