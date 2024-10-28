#include <stdio.h>
#include <stdlib.h>

typedef struct{
    int nota1;
}nota;

typedef struct{
    struct no *anterior;
    struct no *proximo;
    nota n;
}no;

no *corrente, *inicio, *fim, *aux, *remover;

int p;

void inseir_lista(){
    if(inicio == NULL){
        no *novo = malloc(sizeof(no));
        printf("\nInsira o valor do primeiro no : ");
        scanf("%d",&p);
        novo->n.nota1 = p;

        inicio = novo;
        corrente = novo;
        aux = corrente;
        fim = corrente;
        novo->proximo = NULL;
        novo->anterior=NULL;
    }else{
        no *novo = malloc(sizeof(no));
        printf("\nInsira o valor do proximo no : ");
        scanf("%d",&p);
        novo->n.nota1=p;
        novo->anterior = corrente;
        novo->proximo = NULL;
        aux = corrente;
        corrente->proximo = novo;

        corrente = novo;
        fim = corrente;
    }
}

void imprimir_nota(no *n){
    printf("\nNota %d", n->n);
}

no* removerNo(no *inicio, int j){
    int i;

    if(inicio == NULL){
        printf("\nLista vazia!!!");
        return NULL;
    }else{
        remover = inicio;
        for(i=0;i<=j;i++){
           remover = remover->proximo;
        }
        aux = remover->anterior;
        if(remover == NULL){
            printf("\nPosicao na lista incorreta!!");
        }else{
            if(remover == inicio){
                inicio = inicio->proximo;
                inicio->anterior = NULL;
                remover = inicio;
                return remover;
            }else if(remover == fim){
                fim = fim->anterior;
                fim->proximo = NULL;
                remover = fim;
                return remover;
            }else{
                aux->proximo = remover->proximo;
                remover = remover->proximo;
                remover->anterior = aux;
                return NULL;
            }


        }
    }

    return NULL;
}

void imprimir_lista(){
        if(inicio == NULL){
            printf("\nLista vazia!!!!");
        } else{
            printf("\n---- INICIO LISTA ----");
            corrente = inicio;
            while(corrente != NULL){
                imprimir_nota(corrente);
                corrente = corrente->proximo;
                }
                printf("\n-----  FIM LISTA  -----\n");

        }
}


int main(){


    int opcao, removernum;

    do{
        printf("\n*-------------------*\n|     0 - Sair      |\n| 1 - Inserir lista |\n|   2 - Excluir     |\n|3 - Imprimir Lista |\n*-------------------*\n\n");
        scanf("%d", &opcao);
        getchar();
        printf("\nOpcao: %d\n", opcao);

        switch(opcao){
        case 1:
            inseir_lista();

            break;
        case 2:
            imprimir_lista();
            printf("\nEscolha o numero da posicao do ponteiro a ser removido : ");
            scanf("%d", &removernum);
            removerNo(inicio, removernum);
            if(removerNo){
                printf("\nElemento removido com sucesso!!");
            }else{
                printf("\nSem no a ser removido\n");
            }

            break;
        case 3:
                imprimir_lista();

            break;
        default:
            if(opcao != 0)
                printf("\nOpcao invalida!!!\n");
        }
    }while(opcao != 0);
    return 0;

}
