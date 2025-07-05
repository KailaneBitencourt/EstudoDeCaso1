# 🧾 Estudo de Caso: Sistema de Gestão de Funcionários

## 📚 Descrição do Projeto

Este projeto simula um **sistema de gestão de funcionários**, utilizando conceitos de **programação orientada a objetos (POO)** em Java. O sistema permite cadastrar diferentes tipos de funcionários(**horistas** e **mensalistas**) e calcular seus pagamentos de forma polimórfica.

---

## 🧱 Estrutura do Sistema

### 🔹 Classe Base: `Funcionario`

- **Atributos**:
  - `nome` (String)
  - `cpf` (String)
- **Método Abstrato**:
  - `calcularPagamento()`: `double`

### 🔸 Subclasses

#### `FuncionarioHorista`

- **Atributos adicionais**:
  - `horasTrabalhadas` (double)
  - `valorHora` (double)
- **Implementação de** `calcularPagamento()`:
  - `horasTrabalhadas * valorHora`

#### `FuncionarioMensalista`

- **Atributo adicional**:
  - `salarioFixo` (double)
- **Implementação de** `calcularPagamento()`:
  - retorna o `salarioFixo`

---

## 📝 Funcionalidades

✅ Criar uma **lista mista de funcionários** (horistas e mensalistas)  
✅ Calcular e exibir o pagamento de cada funcionário utilizando **polimorfismo**  
✅ Organizar a estrutura de classes com herança e sobrescrita de métodos  

