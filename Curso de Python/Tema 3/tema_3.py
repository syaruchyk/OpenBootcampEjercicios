peso = float(input("Ingrese su peso en kg: "))
estatura = float(input("Ingrese su estatura en metros: "))

imc = peso / (estatura ** 2)
imc_redondeado = round(imc, 2)

print("Tu índice de masa corporal es:", imc_redondeado)
