def call (Map stepParams){
     echo 'Scaning Infrastructure git   code'
     code_dir="${stepParams.code_dir}"
     echo "${code_dir}" 
     if ("${code_dir}" ==~ /.*\.tf$/)   
     {
     sh "checkov --output=junitxml -f ${code_dir} >>checkov.xml"
     }
     else{ 
     sh "checkov --output=junitxml -d ${code_dir} >>checkov.xml"
  }
}
