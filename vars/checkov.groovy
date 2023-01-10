def call (Map stepParams){
     echo 'Scaning Infrastructure git   code'
     code_dir="${stepParams.code_dir}"
     echo "${code_dir}" 
     if ( stepParams.code_dir == "**/*.tf" )
     then
     {
    sh "checkov -f ${code_dir}"
     }
  else{ 
     sh "checkov -d ${code_dir}"
  }
}
