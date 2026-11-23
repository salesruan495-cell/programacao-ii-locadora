# Sistema de Locação de Veículos

**Universidade de Pernambuco — Campus Garanhuns**  
**Curso:** Licenciatura em Computação  
**Disciplina:** Programação II — 2026.2  
**Professor:** Victor Ferreira  
**Grupo:** Grupo 2 

> **Repositório-modelo.** Substitua os campos entre colchetes, registre as decisões reais do grupo e implemente o projeto. Este modelo não contém a solução do sistema.

## 1. Identificação e prazos

| Marco | Prazo | Entrega esperada |
|---|---|---|
| Divulgação do GitHub | **23/11/2026** | Repositório público, integrantes identificados, README inicial, estrutura e commit de desenvolvimento |
| Entrega definitiva | **02/12/2026, até 23h59** | Código, documentação e tag `entrega-2026-12-02` |
| Apresentação | **07/12/2026** | Demonstração, explicação técnica e arguição individual |

**Link do repositório:** https://github.com/salesruan495-cell/programacao-ii-locadora                                                    
**Commit da entrega (hash):** `[preencher após a entrega]`  
**Tag da entrega:** `entrega-2026-12-02`

## 2. Objetivo

Desenvolver uma aplicação Java para cadastrar clientes e veículos, registrar locações e devoluções, consultar informações e calcular valores conforme regras específicas para carros e motocicletas. O sistema deve demonstrar classes, encapsulamento, herança, abstração, polimorfismo, interfaces e tratamento de exceções.

## 3. Equipe e responsabilidades 

O preenchimento desta seção é **obrigatório**. Cada integrante deve aparecer com seu usuário real do GitHub. Até **23/11**, preencher a coluna *Responsabilidades planejadas*. Até **02/12**, atualizar *Entregas realizadas* e indicar evidências verificáveis no histórico. É possível revisar a distribuição de tarefas ao longo do trabalho, registrando as mudanças.

| Integrante | GitHub | Responsabilidades planejadas | Entregas efetivamente realizadas | Evidências (commits/PRs) |
|---|---|---|---|---|
| Sales Ruan | @salesruan495-cell | Modelo de veículos (Veiculo, Carro, Moto e Locavel), cálculo polimórfico (RF05) e cadastro de veículos (RF01) | [Preencher após implementação] | [Links para commits/PRs] |
| Ana Luísa | @Luisa12-dev | Cadastro de clientes (RF02) e consulta/listagem de veículos (RF03) | [Preencher após implementação] | [Links para commits/PRs] |
| Rafael Gueiros | @rafaelgueiros-ui | Classe Locacao, registro de locações (RF04) e devolução de veículos (RF06) | [Preencher após implementação] | [Links para commits/PRs] |
| Enzo Rocha | @enzorochajmj | Exceções, validações, classe SistemaLocacao, consulta de locações (RF07) e testes dos casos de erro | [Preencher após implementação] | [Links para commits/PRs] |
| Gabriel Santos | @gabrielsilvasantos-sketch | Menu do console (Main), documentação (README), diagrama de classes, exemplos de testes e acompanhamento da integração | [Preencher após implementação] | [Links para commits/PRs] |

> Ajuste a quantidade de linhas ao número real de integrantes. **Planejamento não equivale a comprovação de autoria.** A avaliação individual considerará as alterações efetivas e a capacidade de explicá-las. A distribuição acima é apenas ilustrativa; não há obrigação de manter essas atribuições.

### 3.1 Registro de decisões e redistribuição de tarefas

| Data | Decisão ou redistribuição | Responsáveis | Evidência |
|---|---|---|---|
| 22/11 | Definição da divisão das responsabilidades entre os cinco integrantes, conforme as funcionalidades do sistema | Todos os integrantes | README.md |

## 4. Funcionalidades obrigatórias

Atualizar o status somente após implementar e verificar cada requisito.

- [ ] **RF01** — Cadastro de carros e motocicletas sem placa duplicada.
- [ ] **RF02** — Cadastro de clientes com identificador único e CPF sem duplicidade.
- [ ] **RF03** — Listagem e consulta de veículos por placa e disponibilidade.
- [ ] **RF04** — Registro de locação com cliente, veículo disponível e dias válidos.
- [ ] **RF05** — Cálculo polimórfico: carro (diária × dias + R$ 40,00); motocicleta (diária × dias, com 10% de desconto a partir de sete dias).
- [ ] **RF06** — Devolução e liberação do veículo.
- [ ] **RF07** — Consulta de locações com valor e situação.

### 4.1 Conceitos de POO a demonstrar

- [ ] Classes, objetos, métodos e construtores.
- [ ] Encapsulamento, validação de estado e uso pertinente de `this`.
- [ ] Herança entre tipos de veículos.
- [ ] Classe abstrata e método abstrato.
- [ ] Sobrescrita e polimorfismo em operação efetiva.
- [ ] Interface Java declarada com `interface` e implementada com `implements`.
- [ ] Tratamento de exceções com `try`, `catch`, `throw` e exceção personalizada.

## 5. Funcionalidades bônus (opcionais)

- [ ] **Banco de dados (+0,5)**: integração funcional com banco relacional, armazenamento e recuperação dos registros, persistência entre execuções e instruções de configuração.
- [ ] **Interface gráfica (+0,5)**: telas funcionais integradas a cadastro, consulta, locação e devolução.

**Observação:** a interface Java exigida no código é diferente da interface gráfica bônus. Os bônus são independentes e a nota total é limitada a 10,0.

## 6. Tecnologias e organização

| Item | Escolha do grupo |
|---|---|
| Versão do JDK | [informar] |
| IDE | [informar] |
| Organização de pacotes | [informar] |
| Biblioteca ou gerenciador de dependências (se houver) | [informar] |
| Banco de dados (se houver) | [informar] |
| Interface gráfica (se houver) | [informar] |

Estrutura proposta (pode ser adaptada):

```text
.
├── README.md                        # apresentação, equipe e evidências
├── CONTRIBUTING.md                  # padrão de commits e colaboração
├── .gitignore                       # arquivos que não devem ser enviados
├── .github/
│   └── pull_request_template.md     # roteiro opcional de revisão
├── src/                             # código Java implementado pelo grupo
├── docs/
│   ├── MODELAGEM.md                 # classes e relações
│   └── CASOS_DE_TESTE.md            # verificações manuais
└── database/                        # scripts somente se fizer o bônus JDBC
```

## 7. Como compilar e executar

**Pré-requisitos:** [versão do Java, dependências e eventuais configurações].

**Passo 1:** [comando ou procedimento exato para compilar/importar na IDE].  
**Passo 2:** [comando ou procedimento exato para executar].  
**Passo 3:** [exemplo de uso com dados fictícios].

> Antes da entrega, substitua esta seção por instruções que outra pessoa consiga reproduzir. Não inclua senhas nem dados reais de clientes.

## 8. Casos de teste e limitações

Os cenários e resultados estão em [`docs/CASOS_DE_TESTE.md`](docs/CASOS_DE_TESTE.md).  
**Limitações conhecidas:** [descrever ou indicar “nenhuma identificada após os testes realizados”].

## 9. Histórico de colaboração

Padrão obrigatório sugerido para as mensagens: **Conventional Commits**, detalhado em [`CONTRIBUTING.md`](CONTRIBUTING.md).

```text
feat(veiculos): implementa cadastro com validacao de placa
fix(locacao): impede locacao de veiculo indisponivel
docs(readme): registra responsabilidades e instrucoes de execucao
refactor(calculo): separa regras de carros e motos
test(locacao): adiciona verificacao de dias invalidos
```

**Atenção:** a quantidade de commits não equivale, por si só, à contribuição. Serão examinadas a relevância das mudanças e a atribuição correta dos autores. Evitar reescrever o histórico de contribuições, especialmente após a entrega.

## 10. Versão final da avaliação

Ao concluir o trabalho, criar a tag sobre o commit da versão avaliada:

```bash
git tag entrega-2026-12-02
git push origin entrega-2026-12-02
git rev-parse HEAD
```

Registrar no início deste README o hash produzido pelo último comando. A tag deverá apontar para o código efetivamente entregue até **02/12/2026, 23h59**.

---

**Referências de convenções:** [Conventional Commits 1.0.0](https://www.conventionalcommits.org/pt-br/v1.0.0/) · [Documentação do GitHub](https://docs.github.com/)
