package com.mycompany.strategyexperiment.dao.experiment;

import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarComentario;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarComentario;

public class ComentarioSalvarBuscarDaoFactory extends AbstractSalvarBuscarDaoFactory {
    @Override
    public AbstractSalvarBuscarDAO getSalvarBuscarDao() {
        return new ComentarioSalvarBuscarDAO(new SalvarComentario(),
                                             new BuscarComentario());
    }
}
