package br.com.faesa.app.dao

/**
 * Created by wiliam on 5/6/18.
 */

class CreatorTable(
        val table: String,
        val primaryKeyName: String = "ID",
        val columns: Map<String, Type>
) {

    val INTEGER = 1
    val TEXT = 2
    val REAL = 3
    val BLOB = 4

    @Throws(BuildException::class)
    fun makeCreateQuery(): String {

        if (table.isNullOrBlank()) throw BuildException("TABLE is empty")
        if (columns.size == 0) throw BuildException("No column found")

        val stb = StringBuilder()

        stb.append("CREATE TABLE $table (")
        stb.append(primaryKeyName + " INTEGER PRIMARY KEY")

        for ((key, value) in columns) {
            stb.append(", ")
            stb.append(key)
            stb.append(" ")
            stb.append(value.name)
        }

        stb.append("); ")

        return stb.toString()
    }

    @Throws(BuildException::class)
    fun makeCreateJoinQuery(): String {

        if (table.isNullOrBlank()) throw BuildException("TABLE is empty")
        if (columns.size == 0) throw BuildException("No column found")

        val stb = StringBuilder()

        stb.append("CREATE TABLE $table (")
        stb.append(columns.toList().joinToString(", "){
            "${it.first} ${it.second}"
        })

        stb.append("); ")

        return stb.toString()
    }

    enum class Type {
        INTEGER, TEXT, REAL, BLOB
    }

}