package com.lps

class MyNewController {

    MyNewService myNewService
    
    def index = { 
        myNewService.serviceMethod()
    }
}
