package com.mycompany.strategyexperiment.dao.experiment;

import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarAnexo;
import com.mycompany.strategyexperiment.dao.experiment.excluir.ExcluirAnexo;
import com.mycompany.strategyexperiment.dao.experiment.listar.ListarAnexo;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarAnexo;

public class AnexoFullDaoFactory extends FullDaoFactory {

    @Override
    public AbstractFullDAO getFullDao() {
        return new AnexoFullDAO(new SalvarAnexo(),
                                        new ListarAnexo(),
                                        new BuscarAnexo(),
                                        new ExcluirAnexo());
    }
}
