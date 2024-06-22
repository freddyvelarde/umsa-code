from flask import Flask, render_template, request, redirect, url_for
from flask_mysqldb import MySQL

app = Flask(__name__)

app.config["MYSQL_HOST"] = "127.0.0.1"
app.config["MYSQL_USER"] = "root"
app.config["MYSQL_PASSWORD"] = ""
app.config["MYSQL_DB"] = "cinema"
app.config["MYSQL_CURSORCLASS"] = "DictCursor"

mysql = MySQL(app)


# ------------------------ BOLETOS -----------------------------
@app.route("/boletos")
def boletos():
    cur = mysql.connection.cursor()
    cur.execute("SELECT * FROM Boleto")
    data = cur.fetchall()
    cur.close()
    return render_template("boletos.html", boletos=data)


@app.route("/boletos/actualizar/<id>", methods=["GET", "POST"])
def actualizar(id):
    if request.method == "POST":
        # Handle POST request to add a new boleto
        pelicula = request.form["pelicula"]
        precio = request.form["precio"]
        nro_asiento = request.form["nro_asiento"]
        id_sala = request.form["id_sala"]
        fecha = request.form["fecha"]
        hora = request.form["hora"]
        cur = mysql.connection.cursor()
        cur.execute(
            "UPDATE Boleto SET pelicula = %s, id_sala = %s, nro_asiento = %s, fecha = %s, hora = %s, precio = %s WHERE id = %s;",
            (pelicula, id_sala, nro_asiento, fecha, hora, precio, id),
        )
        mysql.connection.commit()
        cur.close()
        return redirect(url_for("boletos"))
    else:
        #  return "hello world ac"
        return render_template("actualizar.html", boleto={"id": id})


@app.route("/boletos/crear", methods=["GET", "POST"])
def crearBoleto():
    if request.method == "POST":
        # Handle POST request to add a new boleto
        pelicula = request.form["pelicula"]
        precio = request.form["precio"]
        nro_asiento = request.form["nro_asiento"]
        id_sala = request.form["id_sala"]
        fecha = request.form["fecha"]
        hora = request.form["hora"]
        cur = mysql.connection.cursor()
        cur.execute(
            "INSERT INTO Boleto (pelicula, precio, nro_asiento, id_sala, fecha, hora) VALUES (%s, %s, %s, %s, %s, %s)",
            (pelicula, precio, nro_asiento, id_sala, fecha, hora),
        )
        mysql.connection.commit()
        cur.close()
        return redirect(url_for("boletos"))
    elif request.method == "GET":
        #  return "hello worl"
        cur = mysql.connection.cursor()
        cur.execute("SELECT * FROM Boleto")
        data = cur.fetchall()
        cur.close()
        return render_template("crearBoleto.html", boletos=data)


@app.route("/boletos/eliminar/<id>", methods=["GET", "DELETE"])
def eliminarBoleto(id):
    cur = mysql.connection.cursor()
    cur.execute("DELETE FROM Boleto WHERE id = %s", (id,))
    mysql.connection.commit()
    cur.close()
    return "boleto eliminado "


# ------------------------ SALAS -----------------------------


@app.route("/salas")
def salas():
    cur = mysql.connection.cursor()
    cur.execute("SELECT * FROM Sala")
    data = cur.fetchall()
    cur.close()
    return render_template("sala.html", salas=data)


@app.route("/salas/crear", methods=["GET", "POST"])
def salasBoleto():
    if request.method == "POST":
        capacidad = request.form["capacidad"]
        nombre_sala = request.form["nombre_sala"]
        tipo_pantalla = request.form["tipo_pantalla"]
        cur = mysql.connection.cursor()
        cur.execute(
            "INSERT INTO Sala (capacidad, nombre_sala, tipo_pantalla) VALUES (%s, %s, %s)",
            (capacidad, nombre_sala, tipo_pantalla),
        )
        mysql.connection.commit()
        cur.close()
        return redirect(url_for("salas"))
    else:
        return render_template("crearSala.html")


@app.route("/salas/actualizar/<id>", methods=["GET", "POST"])
def actualizarSala(id):
    if request.method == "POST":
        capacidad = request.form["capacidad"]
        nombre_sala = request.form["nombre_sala"]
        tipo_pantalla = request.form["tipo_pantalla"]
        cur = mysql.connection.cursor()
        cur.execute(
            "update Sala set capacidad = %s, nombre_sala = %s, tipo_pantalla = %s where id = %s",
            (capacidad, nombre_sala, tipo_pantalla, id),
        )
        mysql.connection.commit()
        cur.close()
        return redirect(url_for("salas"))
    else:
        return render_template("actualizarSala.html", boleto={"id": id})


@app.route("/salas/eliminar/<id>", methods=["GET", "DELETE"])
def eliminarSala(id):
    cur = mysql.connection.cursor()
    cur.execute(
        "delete from Boleto where id_sala = %s", (id,)
    )  # como id_sala es un clave foranea al eliminar la una tabla Sala antes tenemos que eliminar todos los boletos que esten en esa sala
    cur.execute("delete from Sala where id = %s", (id,))
    mysql.connection.commit()
    cur.close()
    return "sala eliminada"


@app.route("/")
def hello_world():
    return "Hello world"
