# JavaDoc

Coletânea de projetos em **Java** feitos durante o curso. Os temas vão de documentação com **Javadoc** e APIs de data e coleções até um sistema acadêmico com **MySQL** e interface gráfica em **Swing**.

## Tecnologias

- Java 21
- NetBeans (projetos Ant) e Maven
- MySQL com JDBC (`mysql-connector-j` 8.0.33)
- Swing (interfaces gráficas)

## Projetos

| Pasta | Tipo | Conteúdo |
|---|---|---|
| `atividade/` | Ant | Cálculo da média de 4 notas com aprovação (média ≥ 6), documentado com Javadoc |
| `Calculadora/` | Ant | Calculadora de terminal com soma, subtração, multiplicação e divisão |
| `javaData/` | Ant | Exemplos das APIs de data e hora do Java |
| `TesteHash/` | Ant | Exemplos de `ArrayList` e `HashMap` |
| `NotasAlunosMaven/` | Maven | Sistema acadêmico com banco MySQL, menu no terminal e telas Swing |
| `mavenproject1/` | Maven | Projeto Maven inicial ("Hello World") |

### `atividade` — Javadoc

- `MediaAluno` calcula a média de 4 notas e informa se o aluno foi aprovado ou reprovado.
- As classes e métodos usam as tags `@author`, `@since`, `@param`, `@return` e `@throws`.
- A documentação HTML gerada está em `atividade/dist/javadoc/`. Para vê-la, abra o `index.html`.

### `Calculadora`

- `Calculos` tem um método para cada operação.
- `Calculadora` lê dois números e o operador (`+`, `-`, `*`, `/`).

### `javaData` — Datas e horas

- **API antiga:** `Date` (`before`/`after`), `Calendar` (definir, somar e subtrair datas), `DateFormat` e `SimpleDateFormat` (formatar e converter texto em data).
- **API moderna (`java.time`):** `LocalDate`, `LocalTime`, `LocalDateTime` e `ChronoField`.

### `TesteHash` — Coleções

- `ArrayList`: inserir, remover, percorrer e ordenar (crescente e decrescente com `Collections.sort`).
- `HashMap`: `put`, `remove`, `containsKey`, `containsValue` e percorrer com `keySet`.
- Um comentário no código compara `Map`, `HashMap`, `TreeMap` e `LinkedHashMap`.

### `NotasAlunosMaven` — Sistema acadêmico

Sistema de gestão escolar conectado ao banco MySQL `sys_notas`.

**Pacote `Suap`** (modelo e acesso aos dados)
- Herança: `PessoaAbstract` → `UsuarioAbstract` → `Alunos` / `Professores`.
- CRUD (inserir, alterar, deletar e listar) com `PreparedStatement` para as tabelas: usuários, alunos, professores, instituição, matrícula, notas, frequências e diário.
- Cálculo da média das notas e do percentual de frequência.
- Boletim que junta nome, sala, turma, média e faltas do aluno.
- `Conexao` abre a conexão JDBC e `Funcoes` limpa a tela e exibe os menus.

**Pacote `Moodle`**
- `MoodleApp`: menu no terminal para inserir, atualizar, deletar e listar registros de cada tabela.

**Pacote `Telas`** (interface Swing)
- `TelaNotas`: lista usuários, alunos, professores e notas, e permite inserir, atualizar e excluir notas com validação de aluno e professor.
- `TelaProfessores`: CRUD de professores.
- `TelaBoletim`: filtra o boletim pelo ID do aluno.
- `PNotas` e `PProfessor` fazem as consultas ao banco usadas pelas telas.
- `Arquivo` exporta a lista de professores para um arquivo de texto formatado.

## Como executar

**Projetos Ant** (`atividade`, `Calculadora`, `javaData`, `TesteHash`): no NetBeans, use **File → Open Project**, abra a pasta e execute a classe com `main`.

**Projetos Maven:**

```bash
cd NotasAlunosMaven
mvn compile exec:java -Dexec.mainClass=Moodle.MoodleApp   # menu no terminal
mvn compile exec:java -Dexec.mainClass=Telas.MainTelas    # tela de notas (Swing)
```

**Banco de dados:** o `NotasAlunosMaven` precisa de um MySQL local com o banco `sys_notas`, usuário `root` e senha vazia. Para mudar esses dados, edite `Suap/Conexao.java`.

## Autores

- **Dheniel Rodrigues** — [@dheniiel](https://github.com/dheniiel)
- No `NotasAlunosMaven`, algumas classes também são assinadas por Felipe e Carlos.
