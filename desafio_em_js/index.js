const calcularImposto = (salario) => {
  if (salario >= 0 && salario <= 1100) {
    const imposto = 0.05 * salario;
    return imposto;
  } else if (salario >= 1100.01 && salario <= 2500.0) {
    const imposto = 0.1 * salario;
    return imposto;
  } else {
    const imposto = 0.15 * salario;
    return imposto;
  }
};

const salario = parseFloat(1000);
const beneficios = parseFloat(400);

const imposto = calcularImposto(salario);

const result = salario - imposto + beneficios;

console.log(result.toFixed(2));
