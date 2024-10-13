export const fakeLogin = (payload) => {
  const { username, password } = payload;
  const user = { username, password };
  return { type: "LOGIN", payload: user };
};
