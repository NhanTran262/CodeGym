const initialState = [
    { id: 1, text: "Learn React" },
    { id: 2, text: "Learn Redux" },
    { id: 3, text: "Build something fun!" },
];
const todosReducer = (state = initialState, action) => {
    switch (action.type) {
        case "TODOS_ADDED": {
            return [
                ...state,
                {
                    id: action.payload.id,
                    text: action.payload.text
                }
            ]
        }
        case "TODOS_DELETED": {
            return state.filter(todo => todo.id !== action.payload)
        }
        default:
            return state
    }
}
export default todosReducer;