export function useState(initialState) {
  let state = initialState;

  const getState = () => {
    return state;
  };

  const setState = (newState) => (state = newState);

  return [getState, setState];
}
