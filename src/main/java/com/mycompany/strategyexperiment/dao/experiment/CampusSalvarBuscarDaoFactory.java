package com.mycompany.strategyexperiment.dao.experiment;

import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarCampus;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarCampus;

public class CampusSalvarBuscarDaoFactory extends AbstractSalvarBuscarDaoFactory {

    @Override
    public AbstractSalvarBuscarDAO getSalvarBuscarDao() {
        return new CampusSalvarBuscarDAO(new SalvarCampus(),
                                         new BuscarCampus());
    }
}
