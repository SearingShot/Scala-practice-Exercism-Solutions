object Bob {
  def response(statement: String): String = {
    if (statement.exists(_.isLetter) & statement.trim().endsWith("?") & statement.filter(_.isLetter).forall(_.isUpper)) {
      // adding filter to filter all alphabets then apply isUpper check on them
      "Calm down, I know what I'm doing!"
    } else if (statement.exists(_.isLetter) & statement.filter(_.isLetter).forall(_.isUpper) & !(statement.trim().endsWith("?"))){
      // exists checks if the particular condition like for eg- aplhabets exists or not
      "Whoa, chill out!"
    } else if (statement.trim().endsWith("?")) {
      "Sure."
    } else if ((statement.trim()).equals("")){
      "Fine. Be that way!"
    } else {
      "Whatever."
    }
  }
}
