<h1 align="center"> MICROSERVICES COM KAFKA </h1>

## O QUE SÃO MICROSERVICES❓❔
✅🥇 A arquitetura de microserviços é um estilo de design de software **onde uma aplicação é dividida em um conjunto de serviços pequenos**, independentes e autônomos que se comunicam entre si, geralmente através de APIs. 

*Nesse caso, quebramos o nosso BACKEND em pequenos projetos, que são os chamados microserviços.*

**Cada microserviço é responsável por uma funcionalidade específica e pode ser desenvolvido, implantado e escalado de forma independente.**
✅🥇

## O QUE É O KAFKA?

✅🥇 Apache Kafka é uma plataforma de streaming de eventos distribuída e de código aberto, projetada para lidar com feeds de dados em tempo real de maneira eficiente.
### Principais Componentes do Kafka:

1. **Producer (Produtor):**
    - Envia registros (mensagens) para os tópicos do Kafka.
2. **Consumer (Consumidor):**
    - Lê e processa os registros de um ou mais tópicos.
3. **Topics (Tópicos):**
    - Categorias ou canais onde os registros são armazenados. Cada tópico pode ser particionado.
4. **Partitions (Partições):**
    - Subdivisões de um tópico que permitem a distribuição e paralelização dos dados. Cada partição é uma sequência ordenada e imutável de registros.
5. **Broker:**
    - Um servidor Kafka que armazena os dados e os serve aos consumidores.
6. **Cluster:**
    - Conjunto de brokers que trabalham juntos para fornecer alta disponibilidade e escalabilidade.
✅🥇
## DESCRIÇÃO DO PROJETO 📝

Projeto simples de pequenos microservices, o objetivo principal é conhecer um pouco mais da arquitetura de microservices e também da biblioteca do kafka que é utilizada para transmissão de dados.

## TECNOLOGIAS UTILIZADAS 🧠

#### BACK-END 💥

<div align = "left">
  <img align="center" alt="js" height="60" width="60" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" />
  <img align="center" alt="js" height="60" width="60" src= "https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original-wordmark.svg" /> 
   <img align="center" alt="js" height="60" width="60"  src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/apachekafka/apachekafka-original.svg" />
       <img align="center" alt="js" height="90" width="90" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/insomnia/insomnia-original-wordmark.svg" />
          
 
                                                      
          
          
          
</div>

## PRÉ REQUISITOS 💻
- É necessário ter o java instalado na máquina (recomendo o download do [JDK](https://www.oracle.com/java/technologies/downloads/) que é o kit de desenvolvimento Java com tudo que você necessita.)
- KAFKA
- [Git 2](https://github.com)
- IDE (sua preferência)

## COMO INSTALAR O KAFKA (WINDOWS)
1. [Download do zip](https://kafka.apache.org/downloads)
2. Descompactar a pasta (de preferência descompactar a pasta no disco C )
3. Entrar na pasta, depois clicar na pasta bin e em seguida na pasta windows
4. Abrir o terminal e rodar o comando para iniciar o zookeeper
```
zookeeper-server-start.bat ../../config/zookeeper.properties
```
5. Em outro terminal, Iniciar o Kafka
```
kafka-server-start.bat ../../config/server.properties
```
## COMO INSTALAR O KAFTA TOOL - APLICATIVO DE INTERFACE GRÁFICA PARA VISUALIZAR E GERENCIAR CLUSTERS KAFKA (OPCIONAL)

## Configurar o Kafka Tool

### Passo 1: Baixar e Instalar o Kafka Tool

[Offset Explorer](https://www.kafkatool.com/download.html)

### Passo 2: Abrir o Kafka Tool e Adicionar um Novo Cluster

1. Abra o Kafka Tool.
2. Vá em `File` > `Add Cluster`.
3. Preencha os detalhes do cluster:
- **Cluster Name**: Escolha um nome descritivo, como "MeuClusterKafka".
- **Bootstrap Servers**: Insira `localhost:9092` (ou o endereço do seu servidor Kafka).
- **Kafka Cluster Version**: Selecione a versão correspondente à sua instalação do Kafka.
- **Zookeeper**: Insira `localhost:2181` (ou o endereço do seu servidor Zookeeper).


### CLONE 💫

## 🚀 API ⚡️ BACK-END 👇🏻🛠

### CLONE 💫

```bash
# Clone o repositório
$ git clone https://github.com/ViniciusSXavier999/microservices-java-spring-kafka.git
# Acesse-o
$ cd "nome-do-microservice-que-deseja-acessar"
```
- Em seguida importe o projeto na sua IDE de preferência
- Execute o projeto através da classe principal 

### End Points
A API tem os seguintes End Points:
| Tipo        | url                        | Funcionalidade                                               |
| ------------ | ------------------------- | -------------------------------------------------------------|
| ```post```   |  "/venda"                 | Cadastra uma nova venda           |


### POST /menu

**REQUEST**
```json
40028922
```

**RESPONSE**
```json
{
   No body returned for response
}
```
  <img src="https://github.com/ViniciusSXavier999/Assets/blob/main/microservices-java-spring-kafka/insomniaimg.png" width="700"/>

### CONSOLE DO MICROSERVICE DE ESTOQUE CONFIRMANDO A VENDA
<img src="https://github.com/ViniciusSXavier999/Assets/blob/main/microservices-java-spring-kafka/vendarecebidanomicroserviceestoque.png" width="700"/>
