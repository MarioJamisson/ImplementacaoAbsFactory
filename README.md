# Exemplo de Padrão Abstract Factory

Este projeto é um exemplo de aplicação do padrão de design **Abstract Factory** em Java. O padrão Abstract Factory fornece uma interface para criar famílias de objetos relacionados sem especificar suas classes concretas. Neste exemplo, o padrão é utilizado para criar móveis clássicos e modernos.

## Estrutura do Código

O código é composto pelas seguintes classes e interfaces:

1. **Cadeira**, **Sofa**, **Mesa**: Classes abstratas que representam diferentes tipos de móveis. Cada classe define um método para interagir com o móvel.

2. **CadeiraClassica**, **SofaClassico**, **MesaClassica**: Implementações clássicas dos móveis que representam o estilo clássico.

3. **CadeiraModerna**, **SofaModerno**, **MesaModerna**: Implementações modernas dos móveis que representam o estilo moderno.

4. **FabricaDeMoveis**: Interface abstrata para criar móveis. Define métodos para criar uma cadeira, um sofá e uma mesa.

5. **FabricaDeMoveisClassicos**: Implementa a fábrica de móveis clássicos. Cria instâncias das implementações clássicas de móveis.

6. **FabricaDeMoveisModernos**: Implementa a fábrica de móveis modernos. Cria instâncias das implementações modernas de móveis.

7. **Main**: Classe principal que demonstra a utilização do padrão Abstract Factory. Cria diferentes fábricas de móveis e utiliza uma função para mobiliar o cômodo com base na fábrica fornecida.

## Como Utilizar

1. **Crie uma fábrica de móveis**:
   ```java
   FabricaDeMoveis fabricaClassica = new FabricaDeMoveisClassicos();
   
2. **Utilize a fábrica para mobiliar o cômodo:**
   ```java
   mobiliarComodo(fabricaClassica);
  Substitua fabricaClassica por fabricaModerna para utilizar a fábrica de móveis modernos:
   ```java
   FabricaDeMoveis fabricaModerna = new FabricaDeMoveisModernos();
   mobiliarComodo(fabricaModerna);
```
3. ## Executar programa
   ```java
   public static void main(String[] args) {
    FabricaDeMoveis fabricaClassica = new FabricaDeMoveisClassicos();
    mobiliarComodo(fabricaClassica);

    FabricaDeMoveis fabricaModerna = new FabricaDeMoveisModernos();
    mobiliarComodo(fabricaModerna);
    }
4. ## Exemplo de Execução
Quando o código é executado, a saída será:
```java
Sentando em uma cadeira clássica de madeira entalhada.
Relaxando em um sofá clássico com estofado de veludo.
Usando uma mesa clássica de mogno.
Sentando em uma cadeira moderna de metal e couro.
Relaxando em um sofá moderno com design minimalista.
Usando uma mesa moderna de vidro.

