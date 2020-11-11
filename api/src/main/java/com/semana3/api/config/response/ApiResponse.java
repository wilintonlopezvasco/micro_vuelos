package com.semana3.api.config.response;

import lombok.Getter;
import lombok.Setter;

public class ApiResponse {

        @Getter
        @Setter
        private String mensaje;

        @Getter @Setter
        private Object data;

        public ApiResponse(String mensaje, Object data){
            this.mensaje = mensaje;
            this.data = data;
        }
}
