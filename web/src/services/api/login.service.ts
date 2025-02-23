import { api } from '@/lib/axios';

import { z } from "zod"

export const loginFormSchema = z.object({
  email: z.string().email({ message: 'Email inválido' }).nonempty({ message: 'Email é obrigatório' }),
  password: z.string().nonempty({ message: 'Senha é obrigatória' }),
});

export type LoginRequest = z.infer<typeof loginFormSchema>;

export interface LoginResponse {
  token: string;
}

export function loginAPIRequest(data: LoginRequest) {
  return api.post<LoginResponse>('auth/login', data);
}
