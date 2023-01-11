def call (Map stepParams){
     echo 'Scaning Infrastructure git   code'
     code_dir="${stepParams.code_dir}"
     echo "${code_dir}" 
     if ("${code_dir}" ==~ *.tf)    // if (item.name ==~ /AAA.*/){  
     {
     sh "checkov -f ${code_dir}"
     }
     else{ 
     sh "checkov -d ${code_dir}"
  }
}
