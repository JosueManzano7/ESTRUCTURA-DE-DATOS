
import csv

nombre_archivo='C:/Users/sigma/Downloads/presenciaredes.csv' #COLOCAR RUTA DE ACCESO DEL DOCUMENTO CSV
with open(nombre_archivo,'r') as archivo:
    lector= csv.reader(archivo,delimiter=",")
    print("RED_SOCIAL CONCEPTO AÑO ENERO FEBRERO MARZO ABRIL MAYO JUNIO JULIO AGOSTO SEPTIEMBRE OCTUBRE NOVIEMBRE DICIEMBRE")
    next(lector,None)
    for fila in lector:
        RED_SOCIAL=fila[0]
        CONCEPTO=fila[1]
        YEAR=fila[2]
        ENERO=fila[3]
        FEBRERO=fila[4]
        MARZO=fila[5]
        ABRIL=fila[6]
        MAYO=fila[7]
        JUNIO=fila[8]
        JULIO=fila[9]
        AGOSTO=fila[10]
        SEPTIEMBRE=fila[11]
        OCTUBRE=fila[12]
        NOVIEMBRE=fila[13]
        DICIEMBRE=fila[14]
        print(RED_SOCIAL," ",CONCEPTO," ",YEAR," ",ENERO," ",FEBRERO," ",MARZO," ",ABRIL," ",MAYO," ",JUNIO," ",JULIO," ",AGOSTO," ",SEPTIEMBRE," ",OCTUBRE," ",NOVIEMBRE," ",DICIEMBRE)

redes=[]
with open(nombre_archivo,'r') as registro:
    lector=csv.reader(registro, delimiter=',')
    for row in lector:
        redes.append(row)

print("\n*************************************************************************************************************************************\n")
print("\n-------------------*DIFERENCIA DE SEGUIDORES (FOLLOWERS) EN TWITTER ENTRE ENERO Y JUNIO*-------------------\n")
junio_follow=int(redes[8][8])
enero_follow=int(redes[8][3])
diferencia=junio_follow-enero_follow
print(f"FOLLOWS EN TWITTER EN ENERO: {enero_follow}")
print(f"FOLLOWS EN TWITTER EN JUNIO: {junio_follow}\n")
print("DIFERENCIA DE SEGUIDORES EN TWITTER ENTRE ENERO Y JUNIO: ",diferencia," SEGUIDORES")

print("\n*************************************************************************************************************************************\n")
print("\n-------------------*DIFERENCIA DE VISUALIZACIONES EN YOUTUBE ENTRE ¿MESES?*-------------------\n")
mes1=input("ESCRIBE UN MES DE ENERO A JUNIO: ")
Mes1=mes1.lower()
if Mes1=='enero':
    nummes1=1
elif Mes1=='febrero':
    nummes1=2
elif Mes1=='marzo':
    nummes1=3
elif Mes1=='abril':
    nummes1=4
elif Mes1=='mayo':
    nummes1=5
elif Mes1=='junio':
    nummes1=6
else:
    nummes1=10000
   
mes2=input("\nESCRIBE EL MES CON EL QUE QUIERES SABER LA DIFERENCIA (DEBE SER ENTRE ENERO Y JUNIO Y DIFERENTE AL PRIMERO): ")
Mes2=mes2.lower()
if Mes2=='enero':
    nummes2=1
elif Mes2=='febrero':
    nummes2=2
elif Mes2=='marzo':
    nummes2=3
elif Mes2=='abril':
    nummes2=4
elif Mes2=='mayo':
    nummes2=5
elif Mes2=='junio':
    nummes2=6
else:
    nummes2=1000
    
if nummes2==1000 or nummes1==10000:
    print("\nDEBEN DE SER MESES ENTRE ENERO Y JUNIO\n")
elif nummes1==nummes2:
    print("\nDEBEN DE SER MESES DIFERENTES\n")
else:
    mesvisuzalizacion1=int(redes[16][nummes1+2])
    mesvisuzalizacion2=int(redes[16][nummes2+2])
    diferencia_visualizaciones=mesvisuzalizacion1-mesvisuzalizacion2
    if diferencia_visualizaciones<0:
        diferencia_visualizaciones=diferencia_visualizaciones*(-1)
    print(f"\nVISUALIZACIONES EN {Mes1.upper()}: {mesvisuzalizacion1}\n")
    print(f"VISUALIZACIONES EN {Mes2.upper()}: {mesvisuzalizacion2}\n")
    print(f"LA DIFERENCIA DE VISUALIZACIONES ENTRE {Mes1.upper()} Y {Mes2.upper()} ES DE: {diferencia_visualizaciones} VISUALIZACIONES")
    
print("\n*************************************************************************************************************************************\n")
print("\n-------------------*PROMEDIO DE CRECIMIENTO DE TWITTER ENTRE ENERO Y JUNIO*-------------------\n")
T_enero=int(redes[9][3])
T_febrero=int(redes[9][4])
T_marzo=int(redes[9][5])
T_abril=int(redes[9][6])
T_mayo=int(redes[9][7])
T_junio=int(redes[9][8])
promT=(T_enero+T_febrero+T_marzo+T_abril+T_mayo+T_junio)/6
print(f"EL PROMEDIO DE CRECIMIENTO DE TIWTTER ENTRE ENERO Y JUNIO ES DE: {promT}")

print("\n-------------------*PROMEDIO DE CRECIMIENTO DE FACEBOOK ENTRE ENERO Y JUNIO*-------------------\n")
F_enero=int(redes[2][3])
F_febrero=int(redes[2][4])
F_marzo=int(redes[2][5])
F_abril=int(redes[2][6])
F_mayo=int(redes[2][7])
F_junio=int(redes[2][8])
promF=(F_enero+F_febrero+F_marzo+F_abril+F_mayo+F_junio)/6
print(f"EL PROMEDIO DE CRECIMIENTO DE TIWTTER ENTRE ENERO Y JUNIO ES DE: {promF}")

print("\n\n\n***************************************************** FIN DEL PROGRAMA :) ******************************************************\n\n\n")