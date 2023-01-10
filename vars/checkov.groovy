def call (Map stepParams){
     echo 'Scaning Infrastructure code'
     Code_Dir="${stepParams.Code_Dir}"
     echo "${Code_Dir}"
     sh 'checkov -f "${Code_Dir}"'
}
