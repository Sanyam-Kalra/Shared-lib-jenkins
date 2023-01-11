def call (Map stepParams){
     echo 'Scaning Infrastructure git   code'
     code_dir="${stepParams.code_dir}"
     echo "${code_dir}" 
     if ("${code_dir}" ==~ /.*\.tf$/)   
     {
     sh "checkov --output=json -f ${code_dir}"
     }
     else{ 
     sh "checkov --output=json -d ${code_dir}"
  }
}
