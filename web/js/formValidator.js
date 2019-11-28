/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function getFormKDefault() {
    $('.form.matriculaForm').form('destroy');
    $('.form.matriculaForm').form({
        fields: {
            name: {
                identifier: 'fName',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un nombre'
                    }]
            },
            lastname: {
                identifier: 'fLastname',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un apellido'
                    }]
            },
            date: {
                identifier: 'kDate',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese una fecha de nacimiento'
                    }]
            },
            lugarNacimiento: {
                identifier: 'kLugarNacimiento',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor seleccione un lugar de nacimiento'
                    }]
            },
            tipoDocumento: {
                identifier: 'kDocumentType',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor seleccione un tipo de documento'
                    }]
            },
            numeroDocumento: {
                identifier: 'kDocument',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un numero de documento'
                    }]
            },
            rh: {
                identifier: 'kRH',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un tipo sanguineo'
                    }]
            },
            genero: {
                identifier: 'kGenero',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un genero'
                    }]
            },
            direccion: {
                identifier: 'kDirection',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese una direccion'
                    }]
            }
        },
        onInvalid: function () {
            console.log("Invalido");
            if ($('a[data-tab="first"]').hasClass('completed')) {
                $('a[data-tab="first"]').removeClass('completed');
            }
            $('a[data-tab="first"]').popup({
                lastResort: 'top center',
                closable: 'false',
                on: 'click'
            }).popup('show');

        },
        onValid: function () {
            console.log("Valido");
            $('a[data-tab="first"]').addClass('completed');
            $('a[data-tab="first"]').popup('destroy');
        }
    });
}

function getFormMDefault() {
    $('.form.matriculaFormM').form('destroy');
    $('.form.matriculaFormM').form({
        fields: {
            name: {
                identifier: 'mName',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un nombre'
                    }]
            },
            apellido: {
                identifier: 'mLastName',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un apellido'
                    }]
            },
            fechaNacimiento: {
                identifier: 'mDate',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese una fecha de nacimiento'
                    }]
            },
            lugarNacimiento: {
                identifier: 'mLugarNacimiento',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor seleccione un lugar de nacimiento'
                    }]
            },
            tipoDocumento: {
                identifier: 'mDocumentType',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor seleccione un tipo de documento'
                    }]
            },
            numeroDocumento: {
                identifier: 'mDocument',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un numero de documento'
                    }]
            },
            rh: {
                identifier: 'mRH',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un grupo sanguineo'
                    }]
            },
            telefono: {
                identifier: 'mPhone',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un numero de telefono'
                    }]
            },
            correo: {
                identifier: 'mEmail',
                rules: [{
                        type: 'email',
                        prompt: 'Por favor ingrese un correo electronico valida'
                    }]
            },
            direccion: {
                identifier: 'mDirection',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese una direccion'
                    }]
            },
            empleo: {
                identifier: 'empleo',
                rules: [{
                        type: 'checked',
                        prompt: 'Por favor seleccione una condicion laboral'
                    }]
            }/*,
             cargo: {
             identifier: 'mEmployerType',
             rules: [{
             type: 'empty',
             prompt: 'Por favor ingrese un cargo valido'
             }]
             }*/
        },
        onInvalid: function () {
            console.log("Invalido");
            if ($('a[data-tab="second"]').hasClass('completed')) {
                $('a[data-tab="second"]').removeClass('completed');
            }
            $('a[data-tab="second"]').popup({
                lastResort: 'top center',
                closable: 'false',
                on: 'click'
            }).popup('show');

        },
        onValid: function () {
            console.log("Valido");
            $('a[data-tab="second"]').addClass('completed');
            $('a[data-tab="second"]').popup('destroy');
        }
    });
}

function getFormMEmployer() {
    $('.form.matriculaFormM').form('destroy');
    $('.form.matriculaFormM').form({
        fields: {
            name: {
                identifier: 'mName',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un nombre'
                    }]
            },
            apellido: {
                identifier: 'mLastName',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un apellido'
                    }]
            },
            fechaNacimiento: {
                identifier: 'mDate',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese una fecha de nacimiento'
                    }]
            },
            lugarNacimiento: {
                identifier: 'mLugarNacimiento',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor seleccione un lugar de nacimiento'
                    }]
            },
            tipoDocumento: {
                identifier: 'mDocumentType',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor seleccione un tipo de documento'
                    }]
            },
            numeroDocumento: {
                identifier: 'mDocument',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un numero de documento'
                    }]
            },
            rh: {
                identifier: 'mRH',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un grupo sanguineo'
                    }]
            },
            telefono: {
                identifier: 'mPhone',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un numero de telefono'
                    }]
            },
            correo: {
                identifier: 'mEmail',
                rules: [{
                        type: 'email',
                        prompt: 'Por favor ingrese un correo electronico valida'
                    }]
            },
            direccion: {
                identifier: 'mDirection',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese una direccion'
                    }]
            },
            empleo: {
                identifier: 'empleo',
                rules: [{
                        type: 'checked',
                        prompt: 'Por favor seleccione una condicion laboral'
                    }]
            },
            cargo: {
                identifier: 'mEmployerType',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un cargo valido'
                    }]
            },
            salario: {
                identifier: 'mSalary',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un salario'
                    }]
            }
        },
        onInvalid: function () {
            console.log("Invalido");
            if ($('a[data-tab="second"]').hasClass('completed')) {
                $('a[data-tab="second"]').removeClass('completed');
            }
            $('a[data-tab="second"]').popup({
                lastResort: 'top center',
                closable: 'false',
                on: 'click'
            }).popup('show');

        },
        onValid: function () {
            console.log("Valido");
            $('a[data-tab="second"]').addClass('completed');
            $('a[data-tab="second"]').popup('destroy');
        }
    });
}

function getFormPDefault() {
    $('.form.matriculaFormP').form('destroy');
    $('.form.matriculaFormP').form({
        fields: {
            nombre: {
                identifier: 'fName',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un nombre'
                    }]
            },
            apellido: {
                identifier: 'fLastName',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un apellido'
                    }]
            },
            fechaNacimiento: {
                identifier: 'fDate',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese una fecha de nacimiento'
                    }]
            },
            lugarNacimiento: {
                identifier: 'fLugarNacimiento',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor seleccione un lugar de nacimiento'
                    }]
            },
            tipoDocumento: {
                identifier: 'fDocumentType',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor seleccione un tipo de documento'
                    }]
            },
            numeroDocumento: {
                identifier: 'fDocument',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un numero de documento'
                    }]
            },
            rh: {
                identifier: 'fRH',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un grupo sanguineo'
                    }]
            },
            telefono: {
                identifier: 'fPhone',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un numero de telefono'
                    }]
            },
            correo: {
                identifier: 'fEmail',
                rules: [{
                        type: 'email',
                        prompt: 'Por favor ingrese un correo valido'
                    }]
            },
            direccion: {
                identifier: 'fDirection',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese una direccion valida'
                    }]
            },
            empleo: {
                identifier: 'fempleo',
                rules: [{
                        type: 'checked',
                        prompt: 'Por favor seleccione una condicion laboral'
                    }]
            }
        },
        onInvalid: function () {
            console.log("Invalido");
            if ($('a[data-tab="third"]').hasClass('completed')) {
                $('a[data-tab="third"]').removeClass('completed');
            }
            $('a[data-tab="third"]').popup({
                lastResort: 'top center',
                closable: 'false',
                on: 'click'
            }).popup('show');

        },
        onValid: function () {
            console.log("Valido");
            $('a[data-tab="third"]').addClass('completed');
            $('a[data-tab="third"]').popup('destroy');
        }
    });
}

function getFormPEmployer() {
    $('.form.matriculaFormP').form('destroy');
    $('.form.matriculaFormP').form({
        fields: {
            nombre: {
                identifier: 'fName',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un nombre'
                    }]
            },
            apellido: {
                identifier: 'fLastName',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un apellido'
                    }]
            },
            fechaNacimiento: {
                identifier: 'fDate',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese una fecha de nacimiento'
                    }]
            },
            lugarNacimiento: {
                identifier: 'fLugarNacimiento',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor seleccione un lugar de nacimiento'
                    }]
            },
            tipoDocumento: {
                identifier: 'fDocumentType',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor seleccione un tipo de documento'
                    }]
            },
            numeroDocumento: {
                identifier: 'fDocument',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un numero de documento'
                    }]
            },
            rh: {
                identifier: 'fRH',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un grupo sanguineo'
                    }]
            },
            telefono: {
                identifier: 'fPhone',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un numero de telefono'
                    }]
            },
            correo: {
                identifier: 'fEmail',
                rules: [{
                        type: 'email',
                        prompt: 'Por favor ingrese un correo valido'
                    }]
            },
            direccion: {
                identifier: 'fDirection',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese una direccion valida'
                    }]
            },
            empleo: {
                identifier: 'fempleo',
                rules: [{
                        type: 'checked',
                        prompt: 'Por favor seleccione una condicion laboral'
                    }]
            },
            cargo: {
                identifier: 'fEmployerType',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un cargo'
                    }]
            },
            salario: {
                identifier: 'fSalary',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un salario'
                    }]
            }
        },
        onInvalid: function () {
            console.log("Invalido");
            if ($('a[data-tab="third"]').hasClass('completed')) {
                $('a[data-tab="third"]').removeClass('completed');
            }
            $('a[data-tab="third"]').popup({
                lastResort: 'top center',
                closable: 'false',
                on: 'click'
            }).popup('show');

        },
        onValid: function () {
            console.log("Valido");
            $('a[data-tab="third"]').addClass('completed');
            $('a[data-tab="third"]').popup('destroy');
        }
    });
}

function getFormADefault() {
    $('.form.matriculaFormA').form('destroy');
    $('.form.matriculaFormA').form({
        fields: {
            nombre: {
                identifier: 'aName',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un nombre'
                    }]
            },
            apellido: {
                identifier: 'aLastName',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un apellido'
                    }]
            },
            fechaNacimiento: {
                identifier: 'aDate',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese una fecha de nacimiento'
                    }]
            },
            lugarNacimiento: {
                identifier: 'aLugarNacimiento',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese una fecha de nacimiento'
                    }]
            },
            tipoDocumento: {
                identifier: 'aDocumentType',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor seleccione un tipo de documento'
                    }]
            },
            numeroDocumento: {
                identifier: 'aDocument',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un numero de documento'
                    }]
            },
            rh: {
                identifier: 'aRH',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un tipo sanguineo'
                    }]
            },
            genero: {
                identifier: 'aGenero',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor seleccione un genero'
                    }]
            },
            telefono: {
                identifier: 'aPhone',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un numero de telefono'
                    }]
            },
            correo: {
                identifier: 'aEmail',
                rules: [{
                        type: 'email',
                        prompt: 'Por favor ingrese un correo valido'
                    }]
            },
            direccion: {
                identifier: 'aDirection',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese una direccion'
                    }]
            },
            parentezco: {
                identifier: 'parentezco',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor seleccione un parentezco'
                    }]
            },
            desplazamiento: {
                identifier: 'desplazamiento',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor seleccione un tipo de desplazamiento'
                    }]
            },
            grupoEtnico: {
                identifier: 'grupoE',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor seleccione un tipo de grupo etnico'
                    }]
            },
            redUnidos: {
                identifier: 'redUnidos',
                rules: [{
                        type: 'checked',
                        prompt: 'Por favor seleccione una opcion en red unidos'
                    }]
            },
            familiasAccion: {
                identifier: 'fAccion',
                rules: [{
                        type: 'checked',
                        prompt: 'Por favor seleccione una opcion en familias en accion'
                    }]
            },
            empleo: {
                identifier: 'aempleo',
                rules: [{
                        type: 'checked',
                        prompt: 'Por favor seleccione una condicion laboral'
                    }]
            }
        },
        onInvalid: function () {
            console.log("Invalido");
            if ($('a[data-tab="fourth"]').hasClass('completed')) {
                $('a[data-tab="fourth"]').removeClass('completed');
            }
            $('a[data-tab="fourth"]').popup({
                lastResort: 'top center',
                closable: 'false',
                on: 'click'
            }).popup('show');

        },
        onValid: function () {
            console.log("Valido");
            $('a[data-tab="fourth"]').addClass('completed');
            $('a[data-tab="fourth"]').popup('destroy');
        }
    });
}

function getFormAEmployer() {
    $('.form.matriculaFormA').form('destroy');
    $('.form.matriculaFormA').form({
        fields: {
            nombre: {
                identifier: 'aName',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un nombre'
                    }]
            },
            apellido: {
                identifier: 'aLastName',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un apellido'
                    }]
            },
            fechaNacimiento: {
                identifier: 'aDate',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese una fecha de nacimiento'
                    }]
            },
            lugarNacimiento: {
                identifier: 'aLugarNacimiento',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese una fecha de nacimiento'
                    }]
            },
            tipoDocumento: {
                identifier: 'aDocumentType',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor seleccione un tipo de documento'
                    }]
            },
            numeroDocumento: {
                identifier: 'aDocument',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un numero de documento'
                    }]
            },
            rh: {
                identifier: 'aRH',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un tipo sanguineo'
                    }]
            },
            genero: {
                identifier: 'aGenero',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor seleccione un genero'
                    }]
            },
            telefono: {
                identifier: 'aPhone',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un numero de telefono'
                    }]
            },
            correo: {
                identifier: 'aEmail',
                rules: [{
                        type: 'email',
                        prompt: 'Por favor ingrese un correo valido'
                    }]
            },
            direccion: {
                identifier: 'aDirection',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese una direccion'
                    }]
            },
            parentezco: {
                identifier: 'parentezco',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor seleccione un parentezco'
                    }]
            },
            desplazamiento: {
                identifier: 'desplazamiento',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor seleccione un tipo de desplazamiento'
                    }]
            },
            grupoEtnico: {
                identifier: 'grupoE',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor seleccione un tipo de grupo etnico'
                    }]
            },
            redUnidos: {
                identifier: 'redUnidos',
                rules: [{
                        type: 'checked',
                        prompt: 'Por favor seleccione una opcion en red unidos'
                    }]
            },
            familiasAccion: {
                identifier: 'fAccion',
                rules: [{
                        type: 'checked',
                        prompt: 'Por favor seleccione una opcion en familias en accion'
                    }]
            },
            empleo: {
                identifier: 'aempleo',
                rules: [{
                        type: 'checked',
                        prompt: 'Por favor seleccione una condicion laboral'
                    }]
            },
            cargo: {
                identifier: 'aEmployerType',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un cargo'
                    }]
            },
            salario: {
                identifier: 'aSalary',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor ingrese un salario'
                    }]
            }
        },
        onInvalid: function () {
            console.log("Invalido");
            if ($('a[data-tab="fourth"]').hasClass('completed')) {
                $('a[data-tab="fourth"]').removeClass('completed');
            }
            $('a[data-tab="fourth"]').popup({
                lastResort: 'top center',
                closable: 'false',
                on: 'click'
            }).popup('show');

        },
        onValid: function () {
            console.log("Valido");
            $('a[data-tab="fourth"]').addClass('completed');
            $('a[data-tab="fourth"]').popup('destroy');
        }
    });
}

function getFormAttDefault() {
    $('.form.matriculaFormAtt').form('destroy');
    $('.form.matriculaFormAtt').form({
        fields: {
            fotoAspirante: {
                identifier: 'file',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue una foto del aspirante'
                    }]
            },
            registroCivil: {
                identifier: 'file2',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el registro civil del aspirante'
                    }]
            },
            certificadoEps: {
                identifier: 'file3',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el certificado de EPS del aspirante'
                    }]
            },
            carnetVacunas: {
                identifier: 'file4',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el carnet de vacunas del aspirante'
                    }]
            },
            certificadoCD: {
                identifier: 'file5',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el certificado de crecimiendo y desarrollo del aspirante'
                    }]
            },
            examenMG: {
                identifier: 'file6',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el examen de medico general del aspirante'
                    }]
            },
            examenVisual: {
                identifier: 'file7',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el examen visual del aspirante'
                    }]
            },
            examenAuditivo: {
                identifier: 'file8',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el examen auditivo del aspirante'
                    }]
            },
            examenOdontologico: {
                identifier: 'file9',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el examen odontologico del aspirante'
                    }]
            },
            cedulaMadre: {
                identifier: 'file10',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el documento de la madre'
                    }]
            },
            cedulaPadre: {
                identifier: 'file12',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el documento del padre'
                    }]
            },
            cartaMadre: {
                identifier: 'file11',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue la carta laboral de la madre, si selecciono "desempleado" por favor suba un documento en blanco'
                    }]
            },
            cartaPadre: {
                identifier: 'file13',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue la carta laboral del padre, si selecciono "desempleado" por favor suba un documento en blanco'
                    }]
            },
            reciboPublico: {
                identifier: 'file14',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el recibo publico'
                    }]
            },
            extrajuicio: {
                identifier: 'file15',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el extrajuicio'
                    }]
            }
        },
        onInvalid: function () {
            console.log("Invalido");
            if ($('a[data-tab="fifth"]').hasClass('completed')) {
                $('a[data-tab="fifth"]').removeClass('completed');
            }
            $('a[data-tab="fifth"]').popup({
                lastResort: 'top center',
                closable: 'false',
                on: 'click'
            }).popup('show');

        },
        onValid: function () {
            console.log("Valido");
            $('a[data-tab="fifth"]').addClass('completed');
            $('a[data-tab="fifth"]').popup('destroy');
        }
    });
}

function getFormAttOnlyFather() {
    $('.form.matriculaFormAtt').form('destroy');
    $('.form.matriculaFormAtt').form({
        fields: {
            fotoAspirante: {
                identifier: 'file',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue una foto del aspirante'
                    }]
            },
            registroCivil: {
                identifier: 'file2',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el registro civil del aspirante'
                    }]
            },
            certificadoEps: {
                identifier: 'file3',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el certificado de EPS del aspirante'
                    }]
            },
            carnetVacunas: {
                identifier: 'file4',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el carnet de vacunas del aspirante'
                    }]
            },
            certificadoCD: {
                identifier: 'file5',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el certificado de crecimiendo y desarrollo del aspirante'
                    }]
            },
            examenMG: {
                identifier: 'file6',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el examen de medico general del aspirante'
                    }]
            },
            examenVisual: {
                identifier: 'file7',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el examen visual del aspirante'
                    }]
            },
            examenAuditivo: {
                identifier: 'file8',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el examen auditivo del aspirante'
                    }]
            },
            examenOdontologico: {
                identifier: 'file9',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el examen odontologico del aspirante'
                    }]
            },
            cedulaPadre: {
                identifier: 'file12',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el documento del padre'
                    }]
            },
            cartaPadre: {
                identifier: 'file13',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue la carta laboral del padre, si selecciono "desempleado" por favor suba un documento en blanco'
                    }]
            },
            reciboPublico: {
                identifier: 'file14',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el recibo publico'
                    }]
            },
            extrajuicio: {
                identifier: 'file15',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el extrajuicio'
                    }]
            }
        },
        onInvalid: function () {
            console.log("Invalido");
            if ($('a[data-tab="fifth"]').hasClass('completed')) {
                $('a[data-tab="fifth"]').removeClass('completed');
            }
            $('a[data-tab="fifth"]').popup({
                lastResort: 'top center',
                closable: 'false',
                on: 'click'
            }).popup('show');

        },
        onValid: function () {
            console.log("Valido");
            $('a[data-tab="fifth"]').addClass('completed');
            $('a[data-tab="fifth"]').popup('destroy');
        }
    });
}

function getFormAttOnlyMother() {
    $('.form.matriculaFormAtt').form('destroy');
    $('.form.matriculaFormAtt').form({
        fields: {
            fotoAspirante: {
                identifier: 'file',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue una foto del aspirante'
                    }]
            },
            registroCivil: {
                identifier: 'file2',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el registro civil del aspirante'
                    }]
            },
            certificadoEps: {
                identifier: 'file3',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el certificado de EPS del aspirante'
                    }]
            },
            carnetVacunas: {
                identifier: 'file4',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el carnet de vacunas del aspirante'
                    }]
            },
            certificadoCD: {
                identifier: 'file5',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el certificado de crecimiendo y desarrollo del aspirante'
                    }]
            },
            examenMG: {
                identifier: 'file6',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el examen de medico general del aspirante'
                    }]
            },
            examenVisual: {
                identifier: 'file7',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el examen visual del aspirante'
                    }]
            },
            examenAuditivo: {
                identifier: 'file8',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el examen auditivo del aspirante'
                    }]
            },
            examenOdontologico: {
                identifier: 'file9',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el examen odontologico del aspirante'
                    }]
            },
            cedulaMadre: {
                identifier: 'file10',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el documento de la madre'
                    }]
            },
            cartaMadre: {
                identifier: 'file11',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue la carta laboral de la madre, se selecciono "desempleado" por favor suba un documento en blanco'
                    }]
            },
            reciboPublico: {
                identifier: 'file14',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el recibo publico'
                    }]
            },
            extrajuicio: {
                identifier: 'file15',
                rules: [{
                        type: 'empty',
                        prompt: 'Por favor cargue el extrajuicio'
                    }]
            }
        },
        onInvalid: function () {
            console.log("Invalido");
            if ($('a[data-tab="fifth"]').hasClass('completed')) {
                $('a[data-tab="fifth"]').removeClass('completed');
            }
            $('a[data-tab="fifth"]').popup({
                lastResort: 'top center',
                closable: 'false',
                on: 'click'
            }).popup('show');

        },
        onValid: function () {
            console.log("Valido");
            $('a[data-tab="fifth"]').addClass('completed');
            $('a[data-tab="fifth"]').popup('destroy');
        }
    });
}

