export const deleteTodoAction=(data)=>{
    return{
        type:"TODOS_DELETED",
        payload:data
    };
}