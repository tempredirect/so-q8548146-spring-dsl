package com.lps

class MyNewService {

    static transactional = true

    def uri1 
    def uri2
    
    def serviceMethod() {
        ['uri1': uri1, 'uri2': uri2]
    }
}
