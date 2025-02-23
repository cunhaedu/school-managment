import { Axios } from 'axios';

export const api = new Axios({
  baseURL: 'http://localhost:8080',
  withCredentials: true,
});
