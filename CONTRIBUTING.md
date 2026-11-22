# Guia de colaboração e versionamento

**Disciplina:** Programação II — 2026.2  
**Projeto:** Sistema de Locação de Veículos

Este documento apresenta um padrão de colaboração **adotado para a atividade**, inspirado em práticas utilizadas por equipes de software. Empresas utilizam fluxos e convenções variados; não existe um único padrão obrigatório em todo o setor.

## 1. Identificação de autoria

Cada integrante deverá configurar o Git com nome e e-mail vinculados à própria conta do GitHub:

```bash
git config --global user.name "Nome do Integrante"
git config --global user.email "email-associado-ao-github@example.com"
```

**Não copie o e-mail do exemplo.** É possível utilizar o endereço privado `noreply` disponibilizado pelo GitHub. Antes de começar, confirme a vinculação entre a identidade local e o perfil do GitHub.

Use sua própria conta. Não compartilhe credenciais nem realize commits usando a identidade de outra pessoa.

## 2. Convenção adotada: Conventional Commits

Formato:

```text
tipo(escopo-opcional): descricao curta
```

- `tipo`: categoria da mudança, escrita em minúsculas.
- `escopo`: área afetada, opcional, entre parênteses.
- `descricao`: ação objetiva em português, sem frases vagas.

| Tipo | Quando utilizar | Exemplo |
|---|---|---|
| `feat` | Nova funcionalidade | `feat(clientes): implementa cadastro sem cpf duplicado` |
| `fix` | Correção de erro | `fix(locacao): corrige disponibilidade apos devolucao` |
| `docs` | Documentação | `docs(readme): adiciona orientacoes de execucao` |
| `refactor` | Reorganização sem alterar o comportamento esperado | `refactor(veiculos): extrai calculo para subclasses` |
| `test` | Inclusão ou ajuste de testes | `test(locacao): cobre tentativa com dias invalidos` |
| `chore` | Manutenção sem nova regra de negócio | `chore(projeto): organiza diretorios iniciais` |
| `build` | Configuração de compilação ou dependências | `build(java): adiciona configuracao de compilacao` |
| `style` | Formatação que não muda comportamento | `style(codigo): padroniza indentacao` |

*Nota:* `feat` e `fix` são tipos fundamentais da especificação; os demais são categorias amplamente utilizadas, mas sua lista não é imposta pela norma.

### Exemplos inadequados

```text
atualizacao
mudancas
commit 3
feat: tudo pronto
fix: corrige varias coisas
```

### Quando detalhar o corpo do commit

Use linhas adicionais quando for necessário explicar **por que** a alteração foi feita ou quais decisões foram adotadas:

```text
fix(locacao): impede nova locacao de placa ocupada

A verificacao ocorre antes de criar o registro, evitando
alteracao parcial do estado do veiculo.
```

## 3. Organização das alterações

- Preferir **commits pequenos e coerentes**, com um objetivo identificável; não dividir artificialmente uma alteração para aumentar a contagem.
- Conferir `git status` e as diferenças antes de confirmar um commit.
- Não enviar arquivos compilados, senhas, tokens ou dados pessoais reais.
- Atualizar o `README.md` quando houver alteração na divisão das tarefas, nas funcionalidades concluídas ou no modo de execução.
- Não apagar o histórico de contribuições de outros integrantes.

## 4. Branches e revisão (recomendados)

Fluxo simples, opcional:

1. Escolher uma tarefa e combinar o responsável.
2. Criar uma branch com nome descritivo, por exemplo `feat/cadastro-clientes` ou `fix/locacao-indisponivel`.
3. Implementar e registrar commits usando o padrão acima.
4. Enviar a branch ao GitHub e abrir um pull request para revisão por outro integrante.
5. Integrar a alteração à branch principal preservando evidências de autoria e atualizar o README.

Exemplo:

```bash
git switch -c feat/cadastro-clientes
git add src/ README.md
git commit -m "feat(clientes): valida cpf duplicado"
git push -u origin feat/cadastro-clientes
```

**Orientação para a avaliação:** quando usar pull requests, prefira uma estratégia que mantenha rastreáveis as contribuições dos autores. Se optarem por *squash*, garantam que o resultado preserve adequadamente os créditos; a simples contagem de commits na branch principal pode não retratar o trabalho de cada pessoa.

## 5. Responsabilidades e evidências

Cada integrante deve ter no `README.md`:

- responsabilidades **planejadas**;
- entregas **efetivamente realizadas**;
- links para commits ou pull requests demonstrando o trabalho.

É permitido reorganizar tarefas conforme necessário. O quadro deve refletir o processo real, não uma divisão fictícia. Tarefas de documentação, testes e revisão também são valiosas, mas os alunos devem ser capazes de explicar a implementação do sistema.

## 6. Marco de entrega

- Até **23/11/2026**: informar o link público, preencher a equipe e iniciar o histórico de desenvolvimento.
- Até **02/12/2026, 23h59**: concluir o projeto, atualizar a documentação e identificar a versão final com a tag `entrega-2026-12-02`.
- Em **07/12/2026**: apresentar a aplicação e explicar as contribuições.

## 7. Referência

[Conventional Commits, especificação 1.0.0](https://www.conventionalcommits.org/pt-br/v1.0.0/).
