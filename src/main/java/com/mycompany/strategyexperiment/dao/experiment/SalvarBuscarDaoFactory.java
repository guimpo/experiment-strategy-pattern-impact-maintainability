package com.mycompany.strategyexperiment.dao.experiment;

import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarCampus;
import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarComentario;
import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarDepartamento;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarCampus;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarComentario;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarDepartamento;

public class SalvarBuscarDaoFactory {
    public AbstractSalvarBuscarDAO getSalvarBuscarDaoFactory(String tipo) {
        
        switch (tipo) {
            case "campus":
                return new CampusSalvarBuscarDAO(new SalvarCampus(),
                                                 new BuscarCampus());
            case "comentario":
                return new ComentarioSalvarBuscarDAO(new SalvarComentario(),
                                                     new BuscarComentario());
            case "departamento":
                return new DepartamentoSalvarBuscarDAO(new SalvarDepartamento(),
                                                       new BuscarDepartamento());
            default:
                return null;
        }
    }
}
