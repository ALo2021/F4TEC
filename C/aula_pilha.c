#include <stdio.h>
#include <stdlib.h>

typedef struct{
    int dia, mes, ano;
}Data;

typedef struct{
    char nome[50];
    Data data;
}Pessoa;

typedef struct no{
    Pessoa p;
    struct no *proximo;
}No;

Pessoa ler_pessoa(){
    Pessoa p;

    printf("\nDigite nome e data de nascimennto dd mm aaaa:\n");
    scanf("%49[^\n]%d%d%d", p.nome, &p.data.dia, &p.data.mes, &p.data.ano);
    return p;
}

void imprimir_pessoa(Pessoa p){
    printf("\nNome: %s\nData: %2d/%2d/%4d\n", p.nome, p.data.dia, p.data.mes, p.data.ano);
}

No* empilhar(No *topo){
    No *novo = malloc(sizeof(No)); // cria novo topo

    if(novo){
        novo->p = ler_pessoa();
        novo->proximo = topo;
        return novo;
    } else
        printf("\nErro ao alocar na memoria...\n");
        return NULL;
}

No* desempillhar(No **topo){
    if(*topo != NULL){
        No *remover = *topo;
        *topo = remover->proximo;
        return remover;
    }
     else{
        printf("\nPilha vazia");
        return NULL;
    }
}

void imprimir_pilha(No *topo){
    printf("\n-------- INICIO PILHA --------\n");
    while(topo){
        imprimir_pessoa(topo->p);
        topo = topo->proximo;
    }
    printf("\n---------  FIM PILHA  --------\n");
}

int main(){
    No *remover, *topo = NULL;
    int opcao;

    do{
        printf("\n*---------------*\n|  0 - Sair     |\n| 1 - Empilhar  |\n|2 - Desempilhar|\n| 3 - Imprimir  |\n*---------------*\n\n");
        scanf("%d", &opcao);
        getchar();
        printf("\nOpcao: %d\n", opcao);

        switch(opcao){
        case 1:
            topo = empilhar(topo);

            break;
        case 2:
            remover = desempillhar(&topo);
            if(remover){
                printf("\nElemento removido com sucesso: ");
                imprimir_pessoa(remover->p);
            }else{
                printf("\nSem no a ser removido\n");
            }

            break;

        case 3:
                imprimir_pilha(topo);

            break;
        default:
            if(opcao != 0)
                printf("\nOpcao invalida!!!\n");
        }
    }while(opcao != 0);
    return 0;
}
