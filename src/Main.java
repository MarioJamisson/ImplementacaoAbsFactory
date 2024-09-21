// Classes base para os móveis
abstract class Cadeira {
    abstract void sentar();
}

abstract class Sofa {
    abstract void relaxar();
}

abstract class Mesa {
    abstract void usar();
}

// Implementações clássicas
class CadeiraClassica extends Cadeira {
    @Override
    void sentar() {
        System.out.println("Sentando em uma cadeira clássica de madeira entalhada.");
    }
}

class SofaClassico extends Sofa {
    @Override
    void relaxar() {
        System.out.println("Relaxando em um sofá clássico com estofado de veludo.");
    }
}

class MesaClassica extends Mesa {
    @Override
    void usar() {
        System.out.println("Usando uma mesa clássica de mogno.");
    }
}

// Implementações modernas
class CadeiraModerna extends Cadeira {
    @Override
    void sentar() {
        System.out.println("Sentando em uma cadeira moderna de metal e couro.");
    }
}

class SofaModerno extends Sofa {
    @Override
    void relaxar() {
        System.out.println("Relaxando em um sofá moderno com design minimalista.");
    }
}

class MesaModerna extends Mesa {
    @Override
    void usar() {
        System.out.println("Usando uma mesa moderna de vidro.");
    }
}

// Fabrica de móveis
abstract class FabricaDeMoveis {
    abstract Cadeira criarCadeira();
    abstract Sofa criarSofa();
    abstract Mesa criarMesa();
}

// Fabrica de móveis clássicos
class FabricaDeMoveisClassicos extends FabricaDeMoveis {
    @Override
    Cadeira criarCadeira() {
        return new CadeiraClassica();
    }

    @Override
    Sofa criarSofa() {
        return new SofaClassico();
    }

    @Override
    Mesa criarMesa() {
        return new MesaClassica();
    }
}

// Fabrica de móveis modernos
class FabricaDeMoveisModernos extends FabricaDeMoveis {
    @Override
    Cadeira criarCadeira() {
        return new CadeiraModerna();
    }

    @Override
    Sofa criarSofa() {
        return new SofaModerno();
    }

    @Override
    Mesa criarMesa() {
        return new MesaModerna();
    }
}

// Função para mobiliar o cômodo
public class Main {
    public static void mobiliarComodo(FabricaDeMoveis fabrica) {
        Cadeira cadeira = fabrica.criarCadeira();
        Sofa sofa = fabrica.criarSofa();
        Mesa mesa = fabrica.criarMesa();

        cadeira.sentar();
        sofa.relaxar();
        mesa.usar();
    }

    public static void main(String[] args) {
        FabricaDeMoveis fabricaClassica = new FabricaDeMoveisClassicos();
        mobiliarComodo(fabricaClassica);

        FabricaDeMoveis fabricaModerna = new FabricaDeMoveisModernos();
        mobiliarComodo(fabricaModerna);
    }
}
